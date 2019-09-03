import akka.actor.ActorRef
import akka.actor.ActorSystem
import akka.actor.Props

fun main() {
    val system = ActorSystem.create("test")
    val actor = system.actorOf(MyAkkaActor03.props())
    actor.tell("hello") // using extension function to omit use of ActorRef.noSender() parameter
    actor.tell("test")
}

// extension functions
private fun ActorRef.tell(s: String) {
    this.tell(s, ActorRef.noSender())
}

