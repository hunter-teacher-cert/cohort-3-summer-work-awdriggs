
for value in {1..8}
do
  mkdir $value
  cd $value
  touch readme.md
  cd ..
done
echo All done
