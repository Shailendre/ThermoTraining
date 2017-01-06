package com.thermofisher.training;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by shailendra.singh on 12/27/16.
 */
@Path("/print")
public interface HelloWorldApi {

    /**
     * since only returns, therfore get,
     * since does not consume any parameter, therfore @consumes not required
     * produce plain text
     * @return
     */

    @GET
    @Path("/helloworld")
    @Produces(MediaType.APPLICATION_JSON)
    Response printHelloWorld();

    @GET
    @Path("/messages")
    @Produces(MediaType.APPLICATION_JSON)
    List<Message> getAllMessages();

    @GET
    @Path("/{messageid}")
    @Produces(MediaType.APPLICATION_JSON)
    Message getMessage(@PathParam("messageid") long id);

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Message addMessage(Message message);

    @PUT
    @Path("/update")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Message updateMessage(Message message);

    @DELETE
    @Path("/{messageId}")
    @Produces(MediaType.APPLICATION_JSON)
    Message deleteMessage(@PathParam("messageId") long id);

}
