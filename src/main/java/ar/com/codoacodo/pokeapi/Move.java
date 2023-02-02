
package ar.com.codoacodo.pokeapi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "move",
    "version_group_details"
})

public class Move {

    @JsonProperty("move")
    public Move__1 move;
    @JsonProperty("version_group_details")
    public List<VersionGroupDetail> versionGroupDetails;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Move.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("move");
        sb.append('=');
        sb.append(((this.move == null)?"<null>":this.move));
        sb.append(',');
        sb.append("versionGroupDetails");
        sb.append('=');
        sb.append(((this.versionGroupDetails == null)?"<null>":this.versionGroupDetails));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
