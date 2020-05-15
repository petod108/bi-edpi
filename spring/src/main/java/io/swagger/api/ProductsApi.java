/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.13).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.Product;
import io.swagger.model.ProductDefinition;
import java.util.UUID;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-15T10:45:56.888Z")

@Api(value = "products", description = "the products API")
@RequestMapping(value = "")
public interface ProductsApi {

    @ApiOperation(value = "show list of all products", nickname = "productsGet", notes = "As user, I want to see the list of all products", response = Product.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = Product.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "", response = Error.class),
        @ApiResponse(code = 401, message = "", response = Error.class),
        @ApiResponse(code = 403, message = "", response = Error.class),
        @ApiResponse(code = 404, message = "", response = Error.class),
        @ApiResponse(code = 500, message = "", response = Error.class) })
    @RequestMapping(value = "/products",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Product>> productsGet() {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("[ {  \"image\" : \"/images/componentRSystem.gif\",  \"name\" : \"RSystem\",  \"description\" : \"description\",  \"id\" : \"id\"}, {  \"image\" : \"/images/componentRSystem.gif\",  \"name\" : \"RSystem\",  \"description\" : \"description\",  \"id\" : \"id\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ProductsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "As user, I want to create product", nickname = "productsPost", notes = "As user, I want to create product", response = Object.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ID of new product", response = Object.class),
        @ApiResponse(code = 400, message = "", response = Error.class),
        @ApiResponse(code = 401, message = "", response = Error.class),
        @ApiResponse(code = 403, message = "", response = Error.class),
        @ApiResponse(code = 404, message = "", response = Error.class),
        @ApiResponse(code = 500, message = "", response = Error.class) })
    @RequestMapping(value = "/products",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Object> productsPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody ProductDefinition product) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("\"{}\"", Object.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ProductsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "As user, I want to delete one product from the catalog", nickname = "productsProductIdDelete", notes = "As user, I want to delete one product from the catalog", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 205, message = "OK"),
        @ApiResponse(code = 400, message = "", response = Error.class),
        @ApiResponse(code = 401, message = "", response = Error.class),
        @ApiResponse(code = 403, message = "", response = Error.class),
        @ApiResponse(code = 404, message = "", response = Error.class),
        @ApiResponse(code = 500, message = "", response = Error.class) })
    @RequestMapping(value = "/products/{productId}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> productsProductIdDelete(@ApiParam(value = "",required=true) @PathVariable("productId") UUID productId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ProductsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "As user, I want to see detail of one product", nickname = "productsProductIdGet", notes = "As user, I want to see detail of one product", response = ProductDefinition.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = ProductDefinition.class),
        @ApiResponse(code = 400, message = "", response = Error.class),
        @ApiResponse(code = 401, message = "", response = Error.class),
        @ApiResponse(code = 403, message = "", response = Error.class),
        @ApiResponse(code = 404, message = "", response = Error.class),
        @ApiResponse(code = 500, message = "", response = Error.class) })
    @RequestMapping(value = "/products/{productId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<ProductDefinition> productsProductIdGet(@ApiParam(value = "",required=true) @PathVariable("productId") UUID productId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("\"\"", ProductDefinition.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ProductsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "As user, I want to update the product", nickname = "productsPut", notes = "As user, I want to update the product", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 205, message = "OK"),
        @ApiResponse(code = 400, message = "", response = Error.class),
        @ApiResponse(code = 401, message = "", response = Error.class),
        @ApiResponse(code = 403, message = "", response = Error.class),
        @ApiResponse(code = 404, message = "", response = Error.class),
        @ApiResponse(code = 500, message = "", response = Error.class) })
    @RequestMapping(value = "/products",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Void> productsPut(@ApiParam(value = "" ,required=true )  @Valid @RequestBody ProductDefinition product) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default ProductsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
