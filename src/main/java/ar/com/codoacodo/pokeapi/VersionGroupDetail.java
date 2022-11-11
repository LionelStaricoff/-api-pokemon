
package ar.com.codoacodo.pokeapi;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "level_learned_at",
    "move_learn_method",
    "version_group"
})

public class VersionGroupDetail {

    @JsonProperty("level_learned_at")
    public Integer levelLearnedAt;
    @JsonProperty("move_learn_method")
    public MoveLearnMethod moveLearnMethod;
    @JsonProperty("version_group")
    public VersionGroup versionGroup;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(VersionGroupDetail.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("levelLearnedAt");
        sb.append('=');
        sb.append(((this.levelLearnedAt == null)?"<null>":this.levelLearnedAt));
        sb.append(',');
        sb.append("moveLearnMethod");
        sb.append('=');
        sb.append(((this.moveLearnMethod == null)?"<null>":this.moveLearnMethod));
        sb.append(',');
        sb.append("versionGroup");
        sb.append('=');
        sb.append(((this.versionGroup == null)?"<null>":this.versionGroup));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
