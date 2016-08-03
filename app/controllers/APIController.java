package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import services.*;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;

import play.db.jpa.Transactional;

/**
 * This controller demonstrates how to use dependency injection to
 * bind a component into a controller class. The class contains an
 * action that shows an incrementing count to users. The {@link Counter}
 * object is injected by the Guice dependency injection system.
 */
@Singleton
public class APIController extends Controller {

    @Inject
    public APIController() {

    }

    /**
     * An action that responds with the {@link Counter}'s current
     * count. The result is plain text. This action is mapped to
     * <code>GET</code> requests with a path of <code>/count</code>
     * requests by an entry in the <code>routes</code> config file.
     */
    @Transactional(readOnly = true)
    public Result get() {

        Company company = new Company();
        company.setName("OSC Technologies, LLC");

        APIStatus status = new APIStatus("200", "Success");

        APIResponse response = new APIResponse(status, Company.getCompanies());
        JsonNode json = Json.toJson(response);

        //ArrayList list = Country.loadCountries(jpa, );

        return ok("This is API test" + json.toString()).as("application/json");
    }

    public Result post() {

        JsonNode json = request().body().asJson();

        if(json == null) {
            return badRequest("Expecting JSON data");
        } else {
            String name = json.findPath("name").textValue();
            if(name == null) {
                return badRequest("Missing parameter [name]");
            } else {
                Company company = new Company();
                company.setName("OSC Technologies, LLC");
                JsonNode json1 = Json.toJson(company);
                return get();
            }
        }
    }

}
