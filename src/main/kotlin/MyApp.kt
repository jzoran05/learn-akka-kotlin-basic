import akka.actor.ActorRef
import akka.actor.ActorSystem
import akka.actor.Props

fun main() {
    val system = ActorSystem.create("test")
    val actor = system.actorOf(MyAkkaActor03.props())
    actor.tell("hello", ActorRef.noSender())
}

// extension functions
//private fun ActorRef.tell(s: String) {

//}

//private fun <T> ActorSystem.actorOf(): Any {

//}
