program badPascal ( input, output );
var x, y, z : integer; {single colon is OK}
begin
  if x = y then      {will this mess up?}
     x := y+ z;      {should be no problem}

{check that blank line}

:= x*y/12.3;  {what about := at the start?}

  x := y;  y := z;  p := q  {multiple := in this line}
  
end.