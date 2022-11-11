
package ar.com.codoacodo.pokeapi;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "diamond-pearl",
    "heartgold-soulsilver",
    "platinum"
})

public class GenerationIv {

    @JsonProperty("diamond-pearl")
    public DiamondPearl diamondPearl;
    @JsonProperty("heartgold-soulsilver")
    public HeartgoldSoulsilver heartgoldSoulsilver;
    @JsonProperty("platinum")
    public Platinum platinum;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GenerationIv.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("diamondPearl");
        sb.append('=');
        sb.append(((this.diamondPearl == null)?"<null>":this.diamondPearl));
        sb.append(',');
        sb.append("heartgoldSoulsilver");
        sb.append('=');
        sb.append(((this.heartgoldSoulsilver == null)?"<null>":this.heartgoldSoulsilver));
        sb.append(',');
        sb.append("platinum");
        sb.append('=');
        sb.append(((this.platinum == null)?"<null>":this.platinum));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
