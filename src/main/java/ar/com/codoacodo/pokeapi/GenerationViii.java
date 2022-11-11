
package ar.com.codoacodo.pokeapi;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "icons"
})

public class GenerationViii {

    @JsonProperty("icons")
    public Icons__1 icons;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GenerationViii.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("icons");
        sb.append('=');
        sb.append(((this.icons == null)?"<null>":this.icons));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
