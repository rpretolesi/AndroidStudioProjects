package com.example.RPRETOLESI.howtorecipe.BE;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.response.UnauthorizedException;
import com.google.appengine.api.users.User;

import javax.inject.Named;

/**
 * Created by RPRETOLESI on 08/01/2015.
 */
@Api(name = "htrepApi", version = "v1", namespace = @ApiNamespace(ownerDomain = "BE.howtorecipe.RPRETOLESI.example.com", ownerName = "BE.howtorecipe.RPRETOLESI.example.com", packagePath = ""))
public class htrep
{
    @ApiMethod(name = "saveProfile")
    public Profile saveProfile(final User user, @Named("name") String name)  throws UnauthorizedException
    {
        if (user == null) {
            throw new UnauthorizedException("Authorization required");
        }

        Profile response = new Profile();
        response.setData("Hi, " + name);

        return response;
    }
}
