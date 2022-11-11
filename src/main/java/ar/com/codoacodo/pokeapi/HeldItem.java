
package ar.com.codoacodo.pokeapi;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "item",
    "version_details"
})

public class HeldItem {

    @JsonProperty("item")
    public Item item;
    @JsonProperty("version_details")
    public List<VersionDetail> versionDetails = null;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HeldItem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("item");
        sb.append('=');
        sb.append(((this.item == null)?"<null>":this.item));
        sb.append(',');
        sb.append("versionDetails");
        sb.append('=');
        sb.append(((this.versionDetails == null)?"<null>":this.versionDetails));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
