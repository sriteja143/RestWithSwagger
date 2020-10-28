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
-------------------------------------------------------------
		<dependency>
			<groupId>com.fasterxml.jackson.dataformat</groupId>
			<artifactId>jackson-dataformat-xml</artifactId>
		</dependency>		
		
sample req ::
----------------
http://localhost:9898/teja
accept application/xml

<HelloBean>
    <message>teja</message>
</HelloBean>

http://localhost:9898/teja
accept application/json
{
  "message": "guru"
}