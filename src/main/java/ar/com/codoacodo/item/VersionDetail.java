
package ar.com.codoacodo.item;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "rarity",
    "version"
})
@Generated("jsonschema2pojo")
public class VersionDetail {

    @JsonProperty("rarity")
    public Integer rarity;
    @JsonProperty("version")
    public Version version;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VersionDetail.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rarity");
        sb.append('=');
        sb.append(((this.rarity == null)?"<null>":this.rarity));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
