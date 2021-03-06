package com.otalk.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author zhangtusheng
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateHotWord {

    public String company_code;

    public List<HotWord> hot_word_list;

}
