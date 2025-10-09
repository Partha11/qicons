package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.Scissors: ImageVector
    get() {
        if (_Scissors != null) {
            return _Scissors!!
        }
        _Scissors = ImageVector.Builder(
            name = "Outlined.Scissors",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(7.848f, 8.25f)
                lineToRelative(1.536f, 0.887f)
                moveTo(7.848f, 8.25f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5.196f, -3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.196f, 3f)
                close()
                moveTo(9.384f, 9.137f)
                arcToRelative(2.165f, 2.165f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.083f, 1.839f)
                curveToRelative(0.005f, 0.351f, 0.054f, 0.695f, 0.14f, 1.024f)
                moveTo(9.384f, 9.137f)
                lineToRelative(2.077f, 1.199f)
                moveTo(7.848f, 15.75f)
                lineToRelative(1.536f, -0.887f)
                moveToRelative(-1.536f, 0.887f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5.196f, 3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.196f, -3f)
                close()
                moveTo(9.384f, 14.863f)
                arcToRelative(2.165f, 2.165f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.083f, -1.838f)
                curveToRelative(0.005f, -0.352f, 0.054f, -0.695f, 0.14f, -1.025f)
                moveToRelative(-1.223f, 2.863f)
                lineToRelative(2.077f, -1.199f)
                moveToRelative(0f, -3.328f)
                arcToRelative(4.323f, 4.323f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.068f, -1.379f)
                lineToRelative(5.325f, -1.628f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.48f, -0.044f)
                lineToRelative(0.803f, 0.215f)
                lineToRelative(-7.794f, 4.5f)
                moveToRelative(-2.882f, -1.664f)
                arcTo(4.33f, 4.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.607f, 12f)
                moveToRelative(3.736f, 0f)
                lineToRelative(7.794f, 4.5f)
                lineToRelative(-0.802f, 0.215f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.48f, -0.043f)
                lineToRelative(-5.326f, -1.629f)
                arcToRelative(4.324f, 4.324f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.068f, -1.379f)
                moveTo(14.343f, 12f)
                lineToRelative(-2.882f, 1.664f)
            }
        }.build()

        return _Scissors!!
    }

@Suppress("ObjectPropertyName")
private var _Scissors: ImageVector? = null
