package ar.com.codoacodo.conection;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"name",
"url"
})
@Generated("jsonschema2pojo")
public class Conection {

@JsonProperty("name")
private String name;
@JsonProperty("url")
private String url;

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("url")
public String getUrl() {
return url;
}

@JsonProperty("url")
public void setUrl(String url) {
this.url = url;
}

@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append(Conection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
sb.append("name");
sb.append('=');
sb.append(((this.name == null)?"<null>":this.name));
sb.append(',');
sb.append("url");
sb.append('=');
sb.append(((this.url == null)?"<null>":this.url));
sb.append(',');
if (sb.charAt((sb.length()- 1)) == ',') {
sb.setCharAt((sb.length()- 1), ']');
} else {
sb.append(']');
}
return sb.toString();
}

}