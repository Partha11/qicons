package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.Briefcase: ImageVector
    get() {
        if (_Briefcase != null) {
            return _Briefcase!!
        }
        _Briefcase = ImageVector.Builder(
            name = "Filled.Briefcase",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.5f, 5.25f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(0.205f)
                curveToRelative(0.933f, 0.085f, 1.857f, 0.197f, 2.774f, 0.334f)
                curveToRelative(1.454f, 0.218f, 2.476f, 1.483f, 2.476f, 2.917f)
                verticalLineToRelative(3.033f)
                curveToRelative(0f, 1.211f, -0.734f, 2.352f, -1.936f, 2.752f)
                arcTo(24.726f, 24.726f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15.75f)
                curveToRelative(-2.73f, 0f, -5.357f, -0.442f, -7.814f, -1.259f)
                curveToRelative(-1.202f, -0.4f, -1.936f, -1.541f, -1.936f, -2.752f)
                lineTo(2.25f, 8.706f)
                curveToRelative(0f, -1.434f, 1.022f, -2.7f, 2.476f, -2.917f)
                arcTo(48.814f, 48.814f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 5.455f)
                lineTo(7.5f, 5.25f)
                close()
                moveTo(15f, 5.25f)
                verticalLineToRelative(0.09f)
                arcToRelative(49.488f, 49.488f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, 0f)
                verticalLineToRelative(-0.09f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, -1.5f)
                horizontalLineToRelative(3f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 1.5f)
                close()
                moveTo(12f, 13.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 18.4f)
                verticalLineToRelative(-2.796f)
                arcToRelative(4.3f, 4.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.713f, 0.31f)
                arcTo(26.226f, 26.226f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 17.25f)
                curveToRelative(2.892f, 0f, 5.68f, -0.468f, 8.287f, -1.335f)
                curveToRelative(0.252f, -0.084f, 0.49f, -0.189f, 0.713f, -0.311f)
                verticalLineTo(18.4f)
                curveToRelative(0f, 1.452f, -1.047f, 2.728f, -2.523f, 2.923f)
                curveToRelative(-2.12f, 0.282f, -4.282f, 0.427f, -6.477f, 0.427f)
                arcToRelative(49.19f, 49.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.477f, -0.427f)
                curveTo(4.047f, 21.128f, 3f, 19.852f, 3f, 18.4f)
                close()
            }
        }.build()

        return _Briefcase!!
    }

@Suppress("ObjectPropertyName")
private var _Briefcase: ImageVector? = null
