package controllers;

import akka.actor.ActorSystem;
import akka.event.Logging;
import akka.event.LoggingAdapter;
import akka.stream.javadsl.Flow;
import models.Message;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.WebSocket;

import javax.inject.Inject;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller
{
   private final ActorSystem system;

   @Inject
   public HomeController(ActorSystem system)
   {
      this.system = system;
   }

   /**
    * An action that renders an HTML page with a welcome message.
    * The configuration in the <code>routes</code> file means that
    * this method will be called when the application receives a
    * <code>GET</code> request with a path of <code>/</code>.
    */
   public Result index()
   {
      return ok(views.html.index.render());
   }

   public WebSocket webSocket()
   {
      final LoggingAdapter logger = Logging.getLogger(this.system, this);
      return WebSocket.json(Message.class).accept(
            request -> Flow.of(Message.class).named("websocket").log("socket", logger).map(message -> new Message(1, "test")));
   }
}