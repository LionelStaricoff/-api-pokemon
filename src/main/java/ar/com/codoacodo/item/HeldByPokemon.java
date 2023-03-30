
package ar.com.codoacodo.item;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "pokemon",
    "version_details"
})
@Generated("jsonschema2pojo")
public class HeldByPokemon {

    @JsonProperty("pokemon")
    public Pokemon pokemon;
    @JsonProperty("version_details")
    public List<VersionDetail> versionDetails;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HeldByPokemon.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("pokemon");
        sb.append('=');
        sb.append(((this.pokemon == null)?"<null>":this.pokemon));
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
