
for value in {0..8}
do
  mkdir $value
  cd $value
  touch readme.md
  cd ..
done
echo All done
