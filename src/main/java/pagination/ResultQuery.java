package pagination;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public class ResultQuery<T> {
    private Integer total;
    private Integer pageNumber;
    private Integer pageSize;
    private List<T> items;
}
