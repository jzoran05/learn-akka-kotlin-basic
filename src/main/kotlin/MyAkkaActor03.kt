import akka.actor.Actor
import akka.actor.Props
import akka.actor.UntypedAbstractActor
import akka.japi.Creator

class MyAkkaActor03 : UntypedAbstractActor() {

    override fun onReceive(message: Any?)  = when(message) {
        "hello" -> println("hello invoked")
        "test" -> println("test invoked")
        else -> println("unsupported")
    }

    companion object {

        fun props(): Props {
            return Props.create<MyAkkaActor03>(MyAkkaActor03::class.java, Creator<MyAkkaActor03> { MyAkkaActor03() })
        }
    }
}
