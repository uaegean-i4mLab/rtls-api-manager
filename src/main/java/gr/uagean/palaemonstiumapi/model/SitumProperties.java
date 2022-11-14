package gr.uagean.palaemonstiumapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SitumProperties {
    // {"type":"FeatureCollection",
    // "features":[{"type":"Feature",
    // "geometry":{"type":"Point",
    // "coordinates":[37.976215,23.7669995]},
    // "properties":{"time":"2022-10-31T18:03:42.326Z",
    // "yaw":1.866106004274404,
    // "local_coordinates":[10.50299072265625,10.499999046325684],
    // "floor_id":36495,"building_id":11940,"level_height":0,"accuracy":3.39},
    // "id":"684560580327","userId":"08a8e803-0c16-46d2-b734-e828bd8b8f9d"}],"
    // devicesInfo":[{"id":"684560580327","organization":"40af6472-bb4a-47cd-9563-91ef56b85bbc",
    // "code":"SM-G980F","user":"08a8e803-0c16-46d2-b734-e828bd8b8f9d","groups":[],"buildings":[],
    // "user_id":"08a8e803-0c16-46d2-b734-e828bd8b8f9d",
    // "created_at":"2022-10-31T08:58:58.785+00:00",
    // "updated_at":"2022-10-31T08:58:58.785+00:00","organization_id":"40af6472-bb4a-47cd-9563-91ef56b85bbc","group_ids":[],"building_ids":[]}]
    // }
    private String time;
    private String yaw;
    @JsonProperty("local_coordinates")
    private double[] localCoordinates;
    @JsonProperty("floor_id")
    private String floorId;
    @JsonProperty("building_id")
    private String buildingId;
    @JsonProperty("level_height")
    private String levelHeight;
    private  double accuracy;

}
