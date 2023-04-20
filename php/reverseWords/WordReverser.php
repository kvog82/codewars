<?php

namespace Test\reverseWords;

class WordReverser
{
    function reverseWords($str) {
        $wordArray = explode(" ", $str);
        foreach ($wordArray as &$word) {
            $word = strrev($word);
        }
        return implode(" ", $wordArray);
    }
}