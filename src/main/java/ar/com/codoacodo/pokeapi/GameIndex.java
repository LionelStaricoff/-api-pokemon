
package ar.com.codoacodo.pokeapi;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "game_index",
    "version"
})

public class GameIndex {

    @JsonProperty("game_index")
    public Integer gameIndex;
    @JsonProperty("version")
    public Version version;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GameIndex.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("gameIndex");
        sb.append('=');
        sb.append(((this.gameIndex == null)?"<null>":this.gameIndex));
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
