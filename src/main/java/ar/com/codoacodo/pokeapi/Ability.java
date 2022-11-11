
package ar.com.codoacodo.pokeapi;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ability",
    "is_hidden",
    "slot"
})

public class Ability {

    @JsonProperty("ability")
    public Ability__1 ability;
    @JsonProperty("is_hidden")
    public Boolean isHidden;
    @JsonProperty("slot")
    public Integer slot;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ability.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ability");
        sb.append('=');
        sb.append(((this.ability == null)?"<null>":this.ability));
        sb.append(',');
        sb.append("isHidden");
        sb.append('=');
        sb.append(((this.isHidden == null)?"<null>":this.isHidden));
        sb.append(',');
        sb.append("slot");
        sb.append('=');
        sb.append(((this.slot == null)?"<null>":this.slot));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
