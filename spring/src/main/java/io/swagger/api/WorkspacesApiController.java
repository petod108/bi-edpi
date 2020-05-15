package io.swagger.api;

import io.swagger.model.ComponentInstance;
import io.swagger.model.ComponentInstanceMetadataSurvey;
import io.swagger.model.EnvironmentNameList;
import io.swagger.model.ModelError;
import io.swagger.model.ProductSurvey;
import java.util.UUID;
import io.swagger.model.Workspace;
import io.swagger.model.WorkspaceBasic;
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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-15T17:21:26.661Z")

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

    public ResponseEntity<Object> addProduct(@ApiParam(value = "Product definition" ,required=true )  @Valid @RequestBody ProductSurvey productDefinition,@ApiParam(value = "",required=true) @PathVariable("workspaceId") UUID workspaceId) {
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

    public ResponseEntity<List<ComponentInstance>> getComponentList(@ApiParam(value = "",required=true) @PathVariable("workspaceId") UUID workspaceId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ComponentInstance>>(objectMapper.readValue("[ {  \"name\" : \"RStudio component\",  \"EnvironmentsStatus\" : [ {    \"environmentName\" : \"DEV\",    \"status\" : \"READY\"  }, {    \"environmentName\" : \"DEV\",    \"status\" : \"READY\"  } ]}, {  \"name\" : \"RStudio component\",  \"EnvironmentsStatus\" : [ {    \"environmentName\" : \"DEV\",    \"status\" : \"READY\"  }, {    \"environmentName\" : \"DEV\",    \"status\" : \"READY\"  } ]} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ComponentInstance>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ComponentInstance>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> submitWorkspace(@ApiParam(value = "ID of workspace",required=true) @PathVariable("workspaceId") UUID workspaceId,@ApiParam(value = "Array of environments where user want to instantiate workspace"  )  @Valid @RequestBody EnvironmentNameList ) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateComponentInAllEnvironmentsOfWorkspace(@ApiParam(value = "component" ,required=true )  @Valid @RequestBody ComponentInstanceMetadataSurvey component,@ApiParam(value = "ID of workspace",required=true) @PathVariable("workspaceId") UUID workspaceId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateWorkspace(@ApiParam(value = "workspace" ,required=true )  @Valid @RequestBody Workspace workspace) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<WorkspaceBasic>> workspacesGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<WorkspaceBasic>>(objectMapper.readValue("[ {  \"name\" : \"RStudio\",  \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\"}, {  \"name\" : \"RStudio\",  \"id\" : \"d290f1ee-6c54-4b01-90e6-d701748f0851\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<WorkspaceBasic>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<WorkspaceBasic>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ComponentInstanceMetadataSurvey> workspacesWorkspaceIdComponentsComponentIdGet(@ApiParam(value = "",required=true) @PathVariable("workspaceId") UUID workspaceId,@ApiParam(value = "",required=true) @PathVariable("componentId") UUID componentId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ComponentInstanceMetadataSurvey>(objectMapper.readValue("{  \"name\" : \"name\",  \"EnvironmentStatusMetadataSurveys\" : [ {    \"environment\" : \"DEV\",    \"metadata\" : [ {      \"value\" : \"Metadata value\",      \"key\" : \"Metadata key\"    }, {      \"value\" : \"Metadata value\",      \"key\" : \"Metadata key\"    } ],    \"surveyList\" : [ {      \"questionVarName\" : \"Which paths you want to select?\",      \"AnswerList\" : [ \"Option1\", \"Option1\" ]    }, {      \"questionVarName\" : \"Which paths you want to select?\",      \"AnswerList\" : [ \"Option1\", \"Option1\" ]    } ],    \"status\" : {      \"environmentName\" : \"DEV\",      \"status\" : \"READY\"    }  }, {    \"environment\" : \"DEV\",    \"metadata\" : [ {      \"value\" : \"Metadata value\",      \"key\" : \"Metadata key\"    }, {      \"value\" : \"Metadata value\",      \"key\" : \"Metadata key\"    } ],    \"surveyList\" : [ {      \"questionVarName\" : \"Which paths you want to select?\",      \"AnswerList\" : [ \"Option1\", \"Option1\" ]    }, {      \"questionVarName\" : \"Which paths you want to select?\",      \"AnswerList\" : [ \"Option1\", \"Option1\" ]    } ],    \"status\" : {      \"environmentName\" : \"DEV\",      \"status\" : \"READY\"    }  } ],  \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\"}", ComponentInstanceMetadataSurvey.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ComponentInstanceMetadataSurvey>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ComponentInstanceMetadataSurvey>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Workspace> workspacesWorkspaceIdGet(@ApiParam(value = "ID of workspace",required=true) @PathVariable("workspaceId") UUID workspaceId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Workspace>(objectMapper.readValue("\"\"", Workspace.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Workspace>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Workspace>(HttpStatus.NOT_IMPLEMENTED);
    }

}
