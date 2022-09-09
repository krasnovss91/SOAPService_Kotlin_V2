package client

import service.DemoWebService
import java.net.URL
import javax.xml.namespace.QName
import javax.xml.ws.Service

class DemoWebServiceClient {

    fun main(args: Array<String>){

        val url = URL("http://localhost:1986/wss/demo?wsdl")

        val qName = QName("http://service.com/", "DemoWebServiceImplService")

        val service = Service.create(url, qName)

        val demoWebService = service.getPort(DemoWebService::class.java)
    }
}