# add files to local repository
# git add .
# commit to local repository
# git commit -a -m "."
# push changes from local repository to github
# git push

function .() {
    git add .
    # git commit -a -m "$1"
    git commit -a -m "."
    git push
}
