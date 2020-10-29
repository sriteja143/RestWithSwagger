<h1> Rest with SWAGGER and XML/JSON format</h1>
Swagger dependency

-------------------------------------------------------------------------------------------------------
		
		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger2</artifactId>
			<version>2.4.0</version>
		</dependency>

		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger-ui</artifactId>
			<version>2.4.0</version>
		</dependency>
----------------------------------------------------------------------------------------------------------
		
Convert response into xml
----------------------------------------------------------------------------------------------------------
		<dependency>
			<groupId>com.fasterxml.jackson.dataformat</groupId>
			<artifactId>jackson-dataformat-xml</artifactId>
		</dependency>		
		
<h2>sample req</h2>
</br>
<h3> req for xml output</h3>
url == http://localhost:9898/teja
</br> 
headers == accept application/xml

-----------------------------------------------------------------------------------------------------------
&lt;HelloBean>
    <message>teja</message>
&lt;/HelloBean>

-----------------------------------------------------------------------------------------------------------
</br>
<h3> req for json output</h3>
url == http://localhost:9898/teja
</br>
headers ==accept application/json
</br>

-------------------------------------------------------------------------------------------------------------

{
  "message": "guru"
}
