$score = 0
while ($True)
{
    Write-Host "Three doors ahead `n a ghost is behind one `n Which door do you open?"
    $g_door = Get-Random -Min 1 -Max 4
    try {
        [int]$s_door = Read-Host -Prompt "1,2 or 3?"
    }
    catch [InvalidCastException]{
        Write-Host 'your answer must be an integer!' -ForegroundColor Yellow
        continue
    }
    if ($s_door -notin 1..3)
    {
        write-host "your answer must be between 1 and 3 inclusive!"
        continue
    }
    elseif ($s_door -eq $g_door)
    {
        Write-Host "GHOST! `n Run away! `n Game over! `n you scored $score" -ForegroundColor Green
        break
    }
    else {
        Write-Host "No ghost! `n You enter the next room." -ForegroundColor Cyan
        $score++
    }
}