package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.CodeBracketSquare: ImageVector
    get() {
        if (_CodeBracketSquare != null) {
            return _CodeBracketSquare!!
        }
        _CodeBracketSquare = ImageVector.Builder(
            name = "Filled.CodeBracketSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                lineTo(6f, 21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                lineTo(3f, 6f)
                close()
                moveTo(17.25f, 12f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.22f, 0.53f)
                lineToRelative(-2.25f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.06f, -1.06f)
                lineTo(15.44f, 12f)
                lineToRelative(-1.72f, -1.72f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.06f, -1.06f)
                lineToRelative(2.25f, 2.25f)
                curveToRelative(0.141f, 0.14f, 0.22f, 0.331f, 0.22f, 0.53f)
                close()
                moveTo(6.97f, 11.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.06f)
                lineToRelative(2.25f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.06f, -1.06f)
                lineTo(8.56f, 12f)
                lineToRelative(1.72f, -1.72f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.06f, -1.06f)
                lineToRelative(-2.25f, 2.25f)
                close()
            }
        }.build()

        return _CodeBracketSquare!!
    }

@Suppress("ObjectPropertyName")
private var _CodeBracketSquare: ImageVector? = null
