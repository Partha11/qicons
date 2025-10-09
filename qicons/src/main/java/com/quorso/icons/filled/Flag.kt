package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.Flag: ImageVector
    get() {
        if (_Flag != null) {
            return _Flag!!
        }
        _Flag = ImageVector.Builder(
            name = "Filled.Flag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(0.54f)
                lineToRelative(1.838f, -0.46f)
                arcToRelative(9.75f, 9.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.725f, 0.738f)
                lineToRelative(0.108f, 0.054f)
                arcTo(8.25f, 8.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 4.524f)
                lineToRelative(3.11f, -0.732f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.917f, 0.81f)
                arcToRelative(47.784f, 47.784f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.005f, 10.337f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.574f, 0.812f)
                lineToRelative(-3.114f, 0.733f)
                arcToRelative(9.75f, 9.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.594f, -0.77f)
                lineToRelative(-0.108f, -0.054f)
                arcToRelative(8.25f, 8.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.69f, -0.625f)
                lineToRelative(-2.202f, 0.55f)
                verticalLineTo(21f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineTo(3f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 2.25f)
                close()
            }
        }.build()

        return _Flag!!
    }

@Suppress("ObjectPropertyName")
private var _Flag: ImageVector? = null
