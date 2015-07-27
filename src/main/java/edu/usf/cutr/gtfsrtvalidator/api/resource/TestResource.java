/*
 * Copyright (C) 2011 Nipuna Gunathilake.
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edu.usf.cutr.gtfsrtvalidator.api.resource;

import edu.usf.cutr.gtfsrtvalidator.api.model.ErrorMessageModel;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class TestResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getTest() {
        ErrorMessageModel hello = new ErrorMessageModel();
        hello.setMessage("heyyyY!");
        return hello.getMessage();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void postHello(Hello hello) {
        //return Response.ok(hello.hello).build();
    }

    public static class Hello {
        public String hello;
    }
}
