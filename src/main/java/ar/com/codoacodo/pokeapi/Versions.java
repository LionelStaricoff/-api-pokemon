
package ar.com.codoacodo.pokeapi;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "generation-i",
    "generation-ii",
    "generation-iii",
    "generation-iv",
    "generation-v",
    "generation-vi",
    "generation-vii",
    "generation-viii"
})

public class Versions {

    @JsonProperty("generation-i")
    public GenerationI generationI;
    @JsonProperty("generation-ii")
    public GenerationIi generationIi;
    @JsonProperty("generation-iii")
    public GenerationIii generationIii;
    @JsonProperty("generation-iv")
    public GenerationIv generationIv;
    @JsonProperty("generation-v")
    public GenerationV generationV;
    @JsonProperty("generation-vi")
    public GenerationVi generationVi;
    @JsonProperty("generation-vii")
    public GenerationVii generationVii;
    @JsonProperty("generation-viii")
    public GenerationViii generationViii;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Versions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("generationI");
        sb.append('=');
        sb.append(((this.generationI == null)?"<null>":this.generationI));
        sb.append(',');
        sb.append("generationIi");
        sb.append('=');
        sb.append(((this.generationIi == null)?"<null>":this.generationIi));
        sb.append(',');
        sb.append("generationIii");
        sb.append('=');
        sb.append(((this.generationIii == null)?"<null>":this.generationIii));
        sb.append(',');
        sb.append("generationIv");
        sb.append('=');
        sb.append(((this.generationIv == null)?"<null>":this.generationIv));
        sb.append(',');
        sb.append("generationV");
        sb.append('=');
        sb.append(((this.generationV == null)?"<null>":this.generationV));
        sb.append(',');
        sb.append("generationVi");
        sb.append('=');
        sb.append(((this.generationVi == null)?"<null>":this.generationVi));
        sb.append(',');
        sb.append("generationVii");
        sb.append('=');
        sb.append(((this.generationVii == null)?"<null>":this.generationVii));
        sb.append(',');
        sb.append("generationViii");
        sb.append('=');
        sb.append(((this.generationViii == null)?"<null>":this.generationViii));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
