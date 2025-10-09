package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.Moon: ImageVector
    get() {
        if (_Moon != null) {
            return _Moon!!
        }
        _Moon = ImageVector.Builder(
            name = "Filled.Moon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.528f, 1.718f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.162f, 0.819f)
                arcTo(8.97f, 8.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 6f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 9f)
                arcToRelative(8.97f, 8.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.463f, -0.69f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.981f, 0.98f)
                arcToRelative(10.503f, 10.503f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.694f, 6.46f)
                curveToRelative(-5.799f, 0f, -10.5f, -4.7f, -10.5f, -10.5f)
                curveToRelative(0f, -4.368f, 2.667f, -8.112f, 6.46f, -9.694f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.818f, 0.162f)
                close()
            }
        }.build()

        return _Moon!!
    }

@Suppress("ObjectPropertyName")
private var _Moon: ImageVector? = null
