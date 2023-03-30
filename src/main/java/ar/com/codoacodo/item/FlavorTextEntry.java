
package ar.com.codoacodo.item;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "language",
    "text",
    "version_group"
})
@Generated("jsonschema2pojo")
public class FlavorTextEntry {

    @JsonProperty("language")
    public Language__1 language;
    @JsonProperty("text")
    public String text;
    @JsonProperty("version_group")
    public VersionGroup versionGroup;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FlavorTextEntry.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("language");
        sb.append('=');
        sb.append(((this.language == null)?"<null>":this.language));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("versionGroup");
        sb.append('=');
        sb.append(((this.versionGroup == null)?"<null>":this.versionGroup));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
