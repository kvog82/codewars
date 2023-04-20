<?php

namespace Test\reverseWords;

use PHPUnit\Framework\TestCase;

require_once 'WordReverser.php';

class WordReverserTest extends TestCase
{

    public function wordsDataProvider()
    {
        return [
            ["This is an example!", "sihT si na !elpmaxe"],
            ["hello hello", "olleh olleh"],
            ["double  spaces", "elbuod  secaps"],
            ["apple", "elppa"]
        ];
    }

    /**
     * @dataProvider wordsDataProvider
     */
    public function testReverseWords($input, $expectedOutput)
    {
        $WordReverser = new WordReverser();
        $this->assertSame($WordReverser->reverseWords($input), $expectedOutput);
    }
}
