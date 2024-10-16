package org.pgm.demo1.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.pgm.demo1.dto.BoardDTO;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<BoardDTO> selectAll();
}
