
package ar.com.codoacodo.pokeapi;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "abilities",
    "base_experience",
    "forms",
    "game_indices",
    "height",
    "held_items",
    "id",
    "is_default",
    "location_area_encounters",
    "moves",
    "name",
    "order",
    "past_types",
    "species",
    "sprites",
    "stats",
    "types",
    "weight"
})

public class PokeApi {

    @JsonProperty("abilities")
    public List<Ability> abilities;
    @JsonProperty("base_experience")
    public Integer baseExperience;
    @JsonProperty("forms")
    public List<Form> forms;
    @JsonProperty("game_indices")
    public List<GameIndex> gameIndices;
    @JsonProperty("height")
    public Integer height;
    @JsonProperty("held_items")
    public List<HeldItem> heldItems;
    @JsonProperty("id")
    public Integer id;
    @JsonProperty("is_default")
    public Boolean isDefault;
    @JsonProperty("location_area_encounters")
    public String locationAreaEncounters;
    @JsonProperty("moves")
    public List<Move> moves;
    @JsonProperty("name")
    public String name;
    @JsonProperty("order")
    public Integer order;
    @JsonProperty("past_types")
    public List<Object> pastTypes;
    @JsonProperty("species")
    public Species species;
    @JsonProperty("sprites")
    public Sprites sprites;
    @JsonProperty("stats")
    public List<Stat> stats;
    @JsonProperty("types")
    public List<Type> types;
    @JsonProperty("weight")
    public Integer weight;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PokeApi.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("abilities");
        sb.append('=');
        sb.append(((this.abilities == null)?"<null>":this.abilities));
        sb.append(',');
        sb.append("baseExperience");
        sb.append('=');
        sb.append(((this.baseExperience == null)?"<null>":this.baseExperience));
        sb.append(',');
        sb.append("forms");
        sb.append('=');
        sb.append(((this.forms == null)?"<null>":this.forms));
        sb.append(',');
        sb.append("gameIndices");
        sb.append('=');
        sb.append(((this.gameIndices == null)?"<null>":this.gameIndices));
        sb.append(',');
        sb.append("height");
        sb.append('=');
        sb.append(((this.height == null)?"<null>":this.height));
        sb.append(',');
        sb.append("heldItems");
        sb.append('=');
        sb.append(((this.heldItems == null)?"<null>":this.heldItems));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("isDefault");
        sb.append('=');
        sb.append(((this.isDefault == null)?"<null>":this.isDefault));
        sb.append(',');
        sb.append("locationAreaEncounters");
        sb.append('=');
        sb.append(((this.locationAreaEncounters == null)?"<null>":this.locationAreaEncounters));
        sb.append(',');
        sb.append("moves");
        sb.append('=');
        sb.append(((this.moves == null)?"<null>":this.moves));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("order");
        sb.append('=');
        sb.append(((this.order == null)?"<null>":this.order));
        sb.append(',');
        sb.append("pastTypes");
        sb.append('=');
        sb.append(((this.pastTypes == null)?"<null>":this.pastTypes));
        sb.append(',');
        sb.append("species");
        sb.append('=');
        sb.append(((this.species == null)?"<null>":this.species));
        sb.append(',');
        sb.append("sprites");
        sb.append('=');
        sb.append(((this.sprites == null)?"<null>":this.sprites));
        sb.append(',');
        sb.append("stats");
        sb.append('=');
        sb.append(((this.stats == null)?"<null>":this.stats));
        sb.append(',');
        sb.append("types");
        sb.append('=');
        sb.append(((this.types == null)?"<null>":this.types));
        sb.append(',');
        sb.append("weight");
        sb.append('=');
        sb.append(((this.weight == null)?"<null>":this.weight));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
