import service.DemoWebServiceImpl
import javax.xml.ws.Endpoint

fun main(args: Array<String>) {

    Endpoint.publish("http://localhost:1986/wss/demo", DemoWebServiceImpl())

}