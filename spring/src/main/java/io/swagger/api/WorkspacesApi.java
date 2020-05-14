/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.13).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Component;
import io.swagger.model.Error;
import io.swagger.model.Product;
import java.util.UUID;
import io.swagger.model.Workspace;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-14T16:38:58.629Z")

@Api(value = "workspaces", description = "the workspaces API")
@RequestMapping(value = "")
public interface WorkspacesApi {

    @ApiOperation(value = "Add product to workspace", nickname = "addProduct", notes = "As user, I want to add a new Product to the workspace", response = Component.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "", response = Component.class) })
    @RequestMapping(value = "/workspaces/{workspaceId}/components",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Component> addProduct(@ApiParam(value = "Product definition" ,required=true )  @Valid @RequestBody Product productDefinition,@ApiParam(value = "",required=true) @PathVariable("workspaceId") UUID workspaceId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("\"\"", Component.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default WorkspacesApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Create the workspace", nickname = "createWorkspace", notes = "As user, I want to create workspace", response = Object.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "returning ID", response = Object.class),
        @ApiResponse(code = 204, message = "OK"),
        @ApiResponse(code = 400, message = "", response = Error.class),
        @ApiResponse(code = 401, message = "", response = Error.class),
        @ApiResponse(code = 403, message = "", response = Error.class),
        @ApiResponse(code = 404, message = "", response = Error.class),
        @ApiResponse(code = 500, message = "", response = Error.class) })
    @RequestMapping(value = "/workspaces",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Object> createWorkspace(@ApiParam(value = "Array of environments where user want to instantiate workspace"  )  @Valid @RequestBody Workspace ) {
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
            log.warn("ObjectMapper or HttpServletRequest not configured in default WorkspacesApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Delete component of workspace", nickname = "deleteComponent", notes = "As user, I want to delete component of workspace", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 202, message = "OK"),
        @ApiResponse(code = 400, message = "", response = Error.class),
        @ApiResponse(code = 401, message = "", response = Error.class),
        @ApiResponse(code = 403, message = "", response = Error.class),
        @ApiResponse(code = 404, message = "", response = Error.class),
        @ApiResponse(code = 500, message = "", response = Error.class) })
    @RequestMapping(value = "/workspaces/{workspaceId}/components/{componentId}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> deleteComponent(@ApiParam(value = "ID of workspace that needs to be deleted",required=true) @PathVariable("workspaceId") UUID workspaceId,@ApiParam(value = "ID of component that needs to be deleted",required=true) @PathVariable("componentId") UUID componentId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default WorkspacesApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Delete a workspace", nickname = "deleteWorkspace", notes = "As user, I want to delete a workspace", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 205, message = "OK"),
        @ApiResponse(code = 400, message = "", response = Error.class),
        @ApiResponse(code = 401, message = "", response = Error.class),
        @ApiResponse(code = 403, message = "", response = Error.class),
        @ApiResponse(code = 404, message = "", response = Error.class),
        @ApiResponse(code = 500, message = "", response = Error.class) })
    @RequestMapping(value = "/workspaces/{workspaceId}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> deleteWorkspace(@ApiParam(value = "ID of workspace that needs to be deleted",required=true) @PathVariable("workspaceId") UUID workspaceId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default WorkspacesApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Update a running components inside of all workspace's environments", nickname = "updateComponentInAllEnvironmentsOfWorkspace", notes = "As user, I want to update components of all workspace's environments", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 205, message = "OK"),
        @ApiResponse(code = 400, message = "", response = Error.class),
        @ApiResponse(code = 401, message = "", response = Error.class),
        @ApiResponse(code = 403, message = "", response = Error.class),
        @ApiResponse(code = 404, message = "", response = Error.class),
        @ApiResponse(code = 500, message = "", response = Error.class) })
    @RequestMapping(value = "/workspaces/{workspaceId}/components",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Void> updateComponentInAllEnvironmentsOfWorkspace(@ApiParam(value = "component" ,required=true )  @Valid @RequestBody Component component,@ApiParam(value = "ID of workspace",required=true) @PathVariable("workspaceId") UUID workspaceId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default WorkspacesApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Change status of component inside of workspace's environment", nickname = "updateComponentStatusInEnvironmentOfWorkspace", notes = "As user, I want to change status of component inside of workspace's environment", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 202, message = "OK"),
        @ApiResponse(code = 400, message = "", response = Error.class),
        @ApiResponse(code = 401, message = "", response = Error.class),
        @ApiResponse(code = 403, message = "", response = Error.class),
        @ApiResponse(code = 404, message = "", response = Error.class),
        @ApiResponse(code = 500, message = "", response = Error.class) })
    @RequestMapping(value = "/workspaces/{workspaceId}/components/{componentId}/environments/{envName}",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Void> updateComponentStatusInEnvironmentOfWorkspace(@ApiParam(value = "status" ,required=true )  @Valid @RequestBody Object status,@ApiParam(value = "",required=true) @PathVariable("workspaceId") UUID workspaceId,@ApiParam(value = "",required=true) @PathVariable("componentId") UUID componentId,@ApiParam(value = "",required=true, allowableValues = "\"DEV\", \"QA\", \"PROD\"") @PathVariable("envName") String envName) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default WorkspacesApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Update a existing workspace", nickname = "updateWorkspace", notes = "As user, I want to update a workspace", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 205, message = "OK"),
        @ApiResponse(code = 400, message = "", response = Error.class),
        @ApiResponse(code = 401, message = "", response = Error.class),
        @ApiResponse(code = 403, message = "", response = Error.class),
        @ApiResponse(code = 404, message = "", response = Error.class),
        @ApiResponse(code = 500, message = "", response = Error.class) })
    @RequestMapping(value = "/workspaces",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Void> updateWorkspace(@ApiParam(value = "workspace" ,required=true )  @Valid @RequestBody Workspace workspace) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default WorkspacesApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "As user, I want to see my workspaces", nickname = "workspacesGet", notes = "As user, I want to see my workspaces", response = Workspace.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = Workspace.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "", response = Error.class),
        @ApiResponse(code = 401, message = "", response = Error.class),
        @ApiResponse(code = 403, message = "", response = Error.class),
        @ApiResponse(code = 404, message = "", response = Error.class),
        @ApiResponse(code = 500, message = "", response = Error.class) })
    @RequestMapping(value = "/workspaces",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Workspace>> workspacesGet() {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("[ {  \"Environments\" : [ \"Environments\", \"Environments\" ],  \"CI\" : \"BI-AS-DATALAKE\",  \"name\" : \"RStudio\",  \"groups\" : [ \"BI-LINUX\", \"BI-USER\" ],  \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\"}, {  \"Environments\" : [ \"Environments\", \"Environments\" ],  \"CI\" : \"BI-AS-DATALAKE\",  \"name\" : \"RStudio\",  \"groups\" : [ \"BI-LINUX\", \"BI-USER\" ],  \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default WorkspacesApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "As user, I want to see component of workspace", nickname = "workspacesWorkspaceIdComponentsComponentIdGet", notes = "As user, I want to see component of workspace", response = Component.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = Component.class),
        @ApiResponse(code = 400, message = "", response = Error.class),
        @ApiResponse(code = 401, message = "", response = Error.class),
        @ApiResponse(code = 403, message = "", response = Error.class),
        @ApiResponse(code = 404, message = "", response = Error.class),
        @ApiResponse(code = 500, message = "", response = Error.class) })
    @RequestMapping(value = "/workspaces/{workspaceId}/components/{componentId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Component> workspacesWorkspaceIdComponentsComponentIdGet(@ApiParam(value = "",required=true) @PathVariable("workspaceId") UUID workspaceId,@ApiParam(value = "",required=true) @PathVariable("componentId") UUID componentId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("\"\"", Component.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default WorkspacesApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "As user, I want to see components in the workspace", nickname = "workspacesWorkspaceIdComponentsGet", notes = "As user, I want to see components in the workspace", response = Component.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = Component.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "", response = Error.class),
        @ApiResponse(code = 401, message = "", response = Error.class),
        @ApiResponse(code = 403, message = "", response = Error.class),
        @ApiResponse(code = 404, message = "", response = Error.class),
        @ApiResponse(code = 500, message = "", response = Error.class) })
    @RequestMapping(value = "/workspaces/{workspaceId}/components",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Component>> workspacesWorkspaceIdComponentsGet(@ApiParam(value = "",required=true) @PathVariable("workspaceId") UUID workspaceId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("[ \"\", \"\" ]", List.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default WorkspacesApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "As user, I want to see details of my workspace", nickname = "workspacesWorkspaceIdGet", notes = "As user, I want to see all information for my workspace", response = Workspace.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation is getting detail of the workspace", response = Workspace.class),
        @ApiResponse(code = 400, message = "", response = Error.class),
        @ApiResponse(code = 401, message = "", response = Error.class),
        @ApiResponse(code = 403, message = "", response = Error.class),
        @ApiResponse(code = 404, message = "", response = Error.class),
        @ApiResponse(code = 500, message = "", response = Error.class) })
    @RequestMapping(value = "/workspaces/{workspaceId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Workspace> workspacesWorkspaceIdGet(@ApiParam(value = "ID of workspace",required=true) @PathVariable("workspaceId") UUID workspaceId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"Environments\" : [ \"Environments\", \"Environments\" ],  \"CI\" : \"BI-AS-DATALAKE\",  \"name\" : \"RStudio\",  \"groups\" : [ \"BI-LINUX\", \"BI-USER\" ],  \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\"}", Workspace.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default WorkspacesApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
