
package ar.com.codoacodo.pokeapi;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "crystal",
    "gold",
    "silver"
})

public class GenerationIi {

    @JsonProperty("crystal")
    public Crystal crystal;
    @JsonProperty("gold")
    public Gold gold;
    @JsonProperty("silver")
    public Silver silver;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GenerationIi.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("crystal");
        sb.append('=');
        sb.append(((this.crystal == null)?"<null>":this.crystal));
        sb.append(',');
        sb.append("gold");
        sb.append('=');
        sb.append(((this.gold == null)?"<null>":this.gold));
        sb.append(',');
        sb.append("silver");
        sb.append('=');
        sb.append(((this.silver == null)?"<null>":this.silver));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
