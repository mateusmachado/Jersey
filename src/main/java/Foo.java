import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("/foo")
public class Foo {

	@GET
	@Produces("text/plain")
	public String showFoo(){
		return "Foo";
	}
}
