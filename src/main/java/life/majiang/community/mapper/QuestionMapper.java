package life.majiang.community.mapper;

import life.majiang.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by Administrator on 2019/12/7 0007.
 */
@Mapper
public interface QuestionMapper {
    @Insert("INSERT INTO question(title, description, gmt_create, gmt_modified, creator, comment_count, view_count, like_count, tag) VALUES (#{title},#{description},#{gmt_create},#{gmt_modified},#{creator},#{comment_count},#{view_count},#{like_count},#{tag})")
    void create(Question question);
}
