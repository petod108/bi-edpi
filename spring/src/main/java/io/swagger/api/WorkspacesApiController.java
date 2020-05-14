package io.swagger.api;

import io.swagger.model.Component;
import io.swagger.model.Error;
import io.swagger.model.Product;
import java.util.UUID;
import io.swagger.model.Workspace;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-14T12:42:30.334Z")

@Controller
public class WorkspacesApiController implements WorkspacesApi {

    private static final Logger log = LoggerFactory.getLogger(WorkspacesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public WorkspacesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Component> addProduct(@ApiParam(value = "Product definition" ,required=true )  @Valid @RequestBody Product productDefinition,@ApiParam(value = "",required=true) @PathVariable("workspaceId") UUID workspaceId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Component>(objectMapper.readValue("\"\"", Component.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Component>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Component>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Object> createWorkspace(@ApiParam(value = "Array of environments where user want to instantiate workspace"  )  @Valid @RequestBody Workspace ) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(objectMapper.readValue("\"{}\"", Object.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteComponent(@ApiParam(value = "ID of workspace that needs to be deleted",required=true) @PathVariable("workspaceId") UUID workspaceId,@ApiParam(value = "ID of component that needs to be deleted",required=true) @PathVariable("componentId") UUID componentId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteWorkspace(@ApiParam(value = "ID of workspace that needs to be deleted",required=true) @PathVariable("workspaceId") UUID workspaceId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateComponentInAllEnvironmentsOfWorkspace(@ApiParam(value = "component" ,required=true )  @Valid @RequestBody Component component,@ApiParam(value = "ID of workspace",required=true) @PathVariable("workspaceId") UUID workspaceId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateComponentStatusInEnvironmentOfWorkspace(@ApiParam(value = "status" ,required=true )  @Valid @RequestBody Object status,@ApiParam(value = "",required=true) @PathVariable("workspaceId") UUID workspaceId,@ApiParam(value = "",required=true) @PathVariable("componentId") UUID componentId,@ApiParam(value = "",required=true, allowableValues = "\"DEV\", \"QA\", \"PROD\"") @PathVariable("envName") String envName) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateWorkspace(@ApiParam(value = "workspace" ,required=true )  @Valid @RequestBody Workspace workspace) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Workspace>> workspacesGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Workspace>>(objectMapper.readValue("[ {  \"Environments\" : [ \"Environments\", \"Environments\" ],  \"CI\" : \"BI-AS-DATALAKE\",  \"name\" : \"RStudio\",  \"groups\" : [ \"BI-LINUX\", \"BI-USER\" ],  \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\"}, {  \"Environments\" : [ \"Environments\", \"Environments\" ],  \"CI\" : \"BI-AS-DATALAKE\",  \"name\" : \"RStudio\",  \"groups\" : [ \"BI-LINUX\", \"BI-USER\" ],  \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Workspace>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Workspace>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Component> workspacesWorkspaceIdComponentsComponentIdGet(@ApiParam(value = "",required=true) @PathVariable("workspaceId") UUID workspaceId,@ApiParam(value = "",required=true) @PathVariable("componentId") UUID componentId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Component>(objectMapper.readValue("\"\"", Component.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Component>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Component>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Component>> workspacesWorkspaceIdComponentsGet(@ApiParam(value = "",required=true) @PathVariable("workspaceId") UUID workspaceId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Component>>(objectMapper.readValue("[ \"\", \"\" ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Component>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Component>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Workspace> workspacesWorkspaceIdGet(@ApiParam(value = "ID of workspace",required=true) @PathVariable("workspaceId") UUID workspaceId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Workspace>(objectMapper.readValue("{  \"Environments\" : [ \"Environments\", \"Environments\" ],  \"CI\" : \"BI-AS-DATALAKE\",  \"name\" : \"RStudio\",  \"groups\" : [ \"BI-LINUX\", \"BI-USER\" ],  \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\"}", Workspace.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Workspace>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Workspace>(HttpStatus.NOT_IMPLEMENTED);
    }

}
