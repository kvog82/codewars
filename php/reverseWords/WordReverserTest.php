<?php

namespace Test\reverseWords;

use PHPUnit\Framework\TestCase;

require_once 'WordReverser.php';

class WordReverserTest extends TestCase{


    public function wordsDataProvider(): array
    {
        return [
            ["This is an example!", "sihT si na !elpmaxe"],
            ["hello hello", "olleh olleh"],
            ["double  spaces", "elbuod  secaps"],
            [" ", " "]
        ];
    }

    /**
     * @test
     * @dataProvider wordsDataProvider
     */
    public function testReverseWords($input, $expected)
    {
        $WordReverser = new WordReverser();
        $this->assertSame($WordReverser->reverseWords($input), $expected);
    }
}
