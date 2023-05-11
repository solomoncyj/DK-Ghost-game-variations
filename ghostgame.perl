#!/usr/bin/perl

use strict;
use warnings;
use feature qw(say);
use POSIX;

sub invalidinput {
    say "Your guess must be a number and between 1 and 3 inclusive!";
    next;
}

my $score = 0;

while (1) {
    say "Three doors ahead...\na ghost is behind one.\nWhich door do you open?";
    my $g_door = int(rand(3)) + 1;
    my $s_door = <STDIN>;
    chomp $s_door;
    $s_door = POSIX::floor($s_door) or invalidinput();
    if ($s_door == $g_door) {
        say "GHOST! \nRun away!\nGame over! you scored $score";
        last;
    }
    elsif ($s_door < 1 || $s_door > 3) {
        invalidinput()
    }
    else {
        say "No ghost!\nYou enter the next room.";
        $score++;
    }
}
