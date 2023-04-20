<?php

namespace Test\reverseWords;

class WordReverser
{
    function reverseWords($str): string
    {
        $wordArray = explode(" ", $str);
        $reversedWordsArray = $this->getReversedWords($wordArray);
        return implode(" ", $reversedWordsArray);
    }

    public function getReversedWords(array $wordArray): array
    {
        foreach ($wordArray as &$word) {
            $word = strrev($word);
        }
        return $wordArray;
    }
}