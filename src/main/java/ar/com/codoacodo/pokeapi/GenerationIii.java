
package ar.com.codoacodo.pokeapi;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "emerald",
    "firered-leafgreen",
    "ruby-sapphire"
})

public class GenerationIii {

    @JsonProperty("emerald")
    public Emerald emerald;
    @JsonProperty("firered-leafgreen")
    public FireredLeafgreen fireredLeafgreen;
    @JsonProperty("ruby-sapphire")
    public RubySapphire rubySapphire;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GenerationIii.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("emerald");
        sb.append('=');
        sb.append(((this.emerald == null)?"<null>":this.emerald));
        sb.append(',');
        sb.append("fireredLeafgreen");
        sb.append('=');
        sb.append(((this.fireredLeafgreen == null)?"<null>":this.fireredLeafgreen));
        sb.append(',');
        sb.append("rubySapphire");
        sb.append('=');
        sb.append(((this.rubySapphire == null)?"<null>":this.rubySapphire));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
