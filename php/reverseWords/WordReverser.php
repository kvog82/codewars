<?php

namespace Test\reverseWords;

class WordReverser
{
    function reverseWords($str) {
        $wordArray = explode(" ", $str);
        $reversedWordsArray = $this->getReversedWords($wordArray);
        return implode(" ", $reversedWordsArray);
    }

    /**
     * @param array $wordArray
     * @return array $wordArray
     */
    public function getReversedWords(array $wordArray)
    {
        foreach ($wordArray as &$word) {
            $word = strrev($word);
        }
        return $wordArray;
    }
}