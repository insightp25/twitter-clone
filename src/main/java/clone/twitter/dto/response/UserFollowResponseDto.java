package clone.twitter.dto.response;

import clone.twitter.domain.Follow;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserFollowResponseDto {

    private UserResponseDto userResponseDto;

    private Follow follow;

    @JsonProperty("isFollowing")
    private boolean isFollowing;
}
